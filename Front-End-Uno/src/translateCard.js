function translateCard(color, value) {
    console.log(color, value);
    return toColor(color) + "_" + toValue(value);
}

function toColor(color) {
    switch (color) {
        case "RED":
            return "red";

        case "GREEN":
            return "green";

        case "YELLOW":
            return "yellow";

        case "BLUE":
            return "blue";
            
        case "BLACK":
            return "blue";
    }
    return color;
}

function toValue(value) {

    switch (value) {
        case "ZERO":
            return "0";
        case "ONE":
            return "1";

        case "TWO":
            return "2";

        case "THREE":
            return "3";

        case "FOUR":
            return "4";

        case "FIVE":
            return "5";

        case "SIX":
            return "6";

        case "SEVEN":
            return "7";

        case "EIGHT":
            return "8";

        case "NINE":
            return "9";

        case "TEN":
            return "10";

        case "DRAWTWO":
            return "draw_2";

        case "WILDDRAWFOUR":
            return "four";

        case "WILD":
            return "wild";

        case "REVERSE":
            return "reverse";

        case "SKIP":
            return "skip";
    }
}
export default translateCard;