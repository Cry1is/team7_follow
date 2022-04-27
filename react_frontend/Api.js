import config from './config.json';

export class Api {
    async getUsers() {
        console.log(process.env.API_URL);
        return await fetch(`${config.api_url}/users`).then(res => res.json());
    }
}