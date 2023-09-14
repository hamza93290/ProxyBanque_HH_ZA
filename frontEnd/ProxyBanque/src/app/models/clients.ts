export class Clients {
    id: number=0
    nom: string=''
    prenom: string=''
    login: string=''
    motDePasse: string=''
    id_conseiller: number 
    
    constructor(nom: string, prenom: string, login: string, motDePasse:string, id_conseiller: number  ){
        this.nom = nom
        this.prenom = prenom
        this.login = login
        this.motDePasse = motDePasse
        this.id_conseiller = id_conseiller
      }
}
