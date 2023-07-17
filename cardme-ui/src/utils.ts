import {serverUrl} from "./constants";

export const fetcher = async (endpoint: string, dataSetter, signal?) => {
    const response = await fetch(`${serverUrl}/${endpoint}`, {signal: signal});
    const jsonData = await response.json();
    dataSetter(jsonData.cartes);
};
