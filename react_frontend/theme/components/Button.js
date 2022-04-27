const primaryVariant = {
    bg: "accent.100",
    shadow: "glow32",
    color: "white",
    fontWeight: "normal",
    _hover: {
        bg: "accent.80",
        shadow: "glow16",
        _disabled: {
            bg: "accent.80",
        },
    },
    _active: {
        bg: "accent.60",
    },
    _disabled: {
        bg: "accent.40",
    },
};

const solidVariant = {
    bg: "ui.5",
    fontWeight: "normal",
    _hover: {
        bg: "ui.10",
    },
    _active: {
        bg: "ui.20",
    },
};

const secondaryVariant = {
    bg: "red.100",
    shadow: "red32",
    fontWeight: "normal",
    _hover: {
        bg: "red.80",
        shadow: "red16",
    },
    _active: {
        bg: "ui.60",
    },
    _disabled: {
        bg: "red.40",
    },
};

const darkVariant = {
    bg: "bg.60",
    shadow: "dark32",
    fontWeight: "normal",
    _hover: {
        bg: "bg.20",
        shadow: "dark16",
    },
    _active: {
        bg: "bg.60",
    },
    _disabled: {
        bg: "bg.40",
    },
};

const popVariant = {
    bg: "ui.100",
    color: "black",
    fontWeight: "normal",
    _hover: {
        bg: "ui.80",
    },
    _active: {
        bg: "ui.60",
    },
};

const ghostVariant = {
    bg: "transparent",
    fontWeight: "normal",
    _hover: {
        bg: "ui.5",
    },
    _active: {
        bg: "ui.10",
    },
};

export default {
    variants: {
        ghost: ghostVariant,
        solid: solidVariant,
        pop: popVariant,
        primary: primaryVariant,
        secondary: secondaryVariant,
        dark: darkVariant,
    },
};
