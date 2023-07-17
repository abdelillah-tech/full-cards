import React from "react";
import {Color, colorToEmoji, Value} from "../../constants";
import "./Card.css";

export interface CardProps {
    color: Color;
    value: Value;
}
const Card = (props: CardProps) => (
    <div className="card">
        <h1>{Value[props.value]}</h1>
        <h1>{colorToEmoji(props.color.toString())}</h1>
    </div>
);

export default Card;
