import { extendTheme } from "@chakra-ui/react";
import components from "./components";
import colors from "./colors";
import shadows from "./shadows";
import { breakpoints } from "./breakpoints";

export default extendTheme({
    breakpoints,
    colors,
    components,
    config: {
        initialColorMode: "dark",
    },
    fonts: {
        heading: "Fira Sans",
        logo: "Righteous",
        body: "Roboto",
    },
    shadows,
    styles: {
        global: {
            "body": {
                bg: "bg.100",
            },

            "::-webkit-scrollbar": {
                w: "3",
                h: "3",
            },

            "::-webkit-scrollbar-track": {
                bg: "bg.80",
                borderRadius: "full",
            },

            "::-webkit-scrollbar-thumb": {
                borderRadius: "full",
                bg: "ui.10",
            },

            "::-webkit-scrollbar-thumb:hover": {
                bg: "ui.10",
            },
        },
    },
    textStyles: {
        paragraph: {
            sm: {
                fontSize: "14px",
                fontWeight: "normal",
            },
            md: {
                fontSize: "16px",
                fontWeight: "normal",
            },
            lg: {
                fontSize: "18px",
                fontWeight: "normal",
            },
        },
        label: {
            sm: {
                fontSize: "16px",
                fontWeight: "medium",
            },
            md: {
                fontSize: "20px",
                fontWeight: "medium",
            },
            lg: {
                fontSize: "24px",
                fontWeight: "medium",
            },
        },
        heading: {
            sm: {
                fontSize: "24px",
            },
            md: {
                fontSize: "36px",
            },
            lg: {
                fontSize: "48px",
            },
            xl: {
                fontSize: "64px",
            },
        },
        logo: {
            xxxs: {
                fontFamily: "heading",
                fontSize: "12px",
            },
            xxs: {
                fontFamily: "heading",
                fontSize: "16px",
            },
            xs: {
                fontFamily: "heading",
                fontSize: "24px",
            },
            sm: {
                fontFamily: "heading",
                fontSize: "32px",
            },
            md: {
                fontFamily: "heading",
                fontSize: "48px",
            },
            lg: {
                fontFamily: "heading",
                fontSize: "64px",
            },
        },
        banner: {
            xs: {
                fontFamily: "logo",
                fontSize: "24px",
            },
            sm: {
                fontFamily: "logo",
                fontSize: "32px",
            },
            md: {
                fontFamily: "logo",
                fontSize: "48px",
            },
            lg: {
                fontFamily: "logo",
                fontSize: "64px",
            },
        },
    },
});
