import React, {useEffect, useState} from "react";
import Main from "components/Main/Main";
import Paquet from "components/Paquet/Paquet";
import {Card as CardType} from "../constants";
import {fetcher} from "../utils";

const Playground = () => {
    const [isMainChanged, setIsMainChanged] = useState<boolean>(false);
    const [cards, setCards] = useState<CardType[]>([]);
    const mix = () => fetcher("paquet/melanger", setCards);
    const reinit = () => fetcher("paquet/reinitPaquet", setCards);
    const reFetchCards = (signal?) => fetcher("paquet", setCards, signal);

    useEffect(() => {
        const abortController = new AbortController();

        reFetchCards(abortController.signal);

        return () => {
            abortController.abort();
        };
    }, []);
    return (
        <>
            <h1>{process.env.NAME}</h1>
            <hr />
            <Paquet cards={cards} mix={mix} reinit={reinit} />
            <Main reFetchCards={reFetchCards} />
        </>
    );
};

export default Playground;
