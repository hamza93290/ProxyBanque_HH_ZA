import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ConseillierLoginComponent } from './conseillier-login/conseillier-login.component';
import { ConsiillerHomeComponent } from './conseiller/consiiller-home/consiiller-home.component';
import { conseillerModuleRoutes } from './conseiller/conseiller.module';

const routes: Routes = [  
  
{ path: '', redirectTo: '/home', pathMatch: 'full' },
{ path:'conseillierLogin' , component : ConseillierLoginComponent},
{ path: 'homeConseiller', children:conseillerModuleRoutes},
{ path: '**', component :HomeComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
