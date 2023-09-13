import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { ConseillierLoginComponent } from './conseillier-login/conseillier-login.component';
import { ConseillerModule } from './conseiller/conseiller.module';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ConseillierLoginComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ConseillerModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
