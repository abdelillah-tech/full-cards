import React from "react";
import Card from "components/Card/Card";
import "./Paquet.css";

const Paquet = ({cards = [], mix, reinit}) => {
    return (
        <div className="control">
            <h2>Le paquet</h2>
            <div>
                <button className="control-button" onClick={mix}>
                    Mélanger
                </button>
                <button className="control-button" onClick={reinit}>
                    Reinitialiser
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

export default Paquet;
