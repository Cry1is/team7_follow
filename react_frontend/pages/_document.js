import { Html, Head, Main, NextScript } from "next/document";

export default function Document() {
    return (
        <Html>
            <Head>
                <link rel="preconnect" href="https://fonts.googleapis.com" />
                <link
                    rel="preconnect"
                    href="https://fonts.gstatic.com"
                />
                <link
                    href="https://fonts.googleapis.com/css2?family=Righteous&family=Roboto&family=Proxima Nova&family=Inter&family=Fira Sans:wght@500;600&display=swap"
                    rel="stylesheet" />
                <link rel="manifest" href="/manifest.json"></link>
                <link rel="apple-touch-icon" href="/images/bot-icon.png"></link>
            </Head>
            <body>
                <Main />
                <NextScript />
            </body>
        </Html>
    );
}