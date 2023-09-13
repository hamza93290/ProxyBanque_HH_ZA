import { Component, Input, OnInit, Output} from '@angular/core';
import { Clients } from 'src/app/models/clients';
import { Conseiller } from 'src/app/models/conseiller';
import { ClientsService } from 'src/app/services/clients.service';
import { ConseillersService } from 'src/app/services/conseillers.service';

@Component({
  selector: 'app-consiiller-home',
  templateUrl: './consiiller-home.component.html',
  styleUrls: ['./consiiller-home.component.css']
})
export class ConsiillerHomeComponent {

 //@Input()
  //clients: Clients[] = []
  conseillers : Conseiller[] = []

  constructor(private clientServ : ClientsService, private conseillerServ: ConseillersService){}

  getClients(){
   // this.clientServ.getClients().subscribe(data => this.clients = data)
  }
  ngOnInit() {
    //this.clientServ.getClients().subscribe(data => this.clients = data)
     this.conseillerServ.getConseillers().subscribe(data => this.conseillers = data)
  }
}
