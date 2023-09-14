import { Clients } from "./clients"

export interface Conseiller {

    id: number
    name: string
    password: string
    clients: Clients[]

   
}
