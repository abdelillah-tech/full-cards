import React from "react";
import {useEffect, useState} from "react";
import {Card as CardType} from "../../constants";
import Card from "components/Card/Card";
import {fetcher} from "../../utils";
import "./Main.css";

const Main = ({reFetchCards}) => {
    const [cards, setCards] = useState<CardType[]>([]);
    const trieCouleur = () => fetcher("main/trieCouleur", setCards);
    const trieValeur = () => fetcher("main/trieValeur", setCards);
    const nouvellesCartes = () => {
        reFetchCards();
        fetcher("main/nouvellesCartes", setCards);
    };
    useEffect(() => {
        const abortController = new AbortController();
        fetcher("main", setCards, abortController.signal);
        return () => {
            abortController.abort();
        };
    }, []);

    return (
        <div className="control">
            <h2>La main</h2>
            <div>
                <button className="control-button" onClick={trieCouleur}>
                    Trier par couleur
                </button>
                <button className="control-button" onClick={trieValeur}>
                    Trier par valeur
                </button>
                <button className="control-button" onClick={nouvellesCartes}>
                    Nouvelle main
                </button>
            </div>
            <div className="cards-container">
                {cards
                    ? cards.map((card, index) => (
                          <Card key={index} color={card.color} value={card.value} />
                      ))
                    : []}
            </div>
        </div>
    );
};

export default Main;
