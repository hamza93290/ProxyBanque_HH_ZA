import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

//import { ConseillerRoutingModule } from './conseiller-routing.module';
import { ConsiillerHomeComponent } from './consiiller-home/consiiller-home.component';
import { Routes } from '@angular/router';

export const conseillerModuleRoutes : Routes = [{path: '', component: ConsiillerHomeComponent }] 

@NgModule({
  declarations: [
    ConsiillerHomeComponent
  ],
  imports: [
    CommonModule,
    //ConseillerRoutingModule
  ]
})
export class ConseillerModule { }
