import { Party } from "./party";

export class RsvpDTO {

    constructor(
        private party: Party,
        private successBool: string
    ) {}

    public getParty(): Party {
        return this.party
    }

    public setParty(party: Party) {
        this.party = party;
    }

    public getSuccessBool(): string {
        return this.successBool;
    }

    public setSuccessBool(successBool: string) {
        this.successBool = successBool;
    }
}


