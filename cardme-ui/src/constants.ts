export enum Color {
    PIQUE,
    COEUR,
    CARREAUX,
    TREFLE
}

export enum Value {
    AS = "A",
    ROI = "K",
    DAME = "Q",
    VALET = "V",
    DIX = "10",
    NEUF = "9",
    HUIT = "8",
    SEPT = "7",
    SIX = "6",
    CINQ = "5",
    QUATRE = "4",
    TROIS = "3",
    DEUX = "2"
}

export type Card = {
    color: Color;
    value: Value;
};

export const colorToEmoji = (color: string) => {
    switch (color) {
        case "PIQUE":
            return "♠️";
        case "COEUR":
            return "♥️";
        case "CARREAUX":
            return "♦️";
        case "TRÈFLE":
            return "♣️";
        default:
            return "";
    }
};

export const serverUrl = "http://127.0.0.1:8080";
