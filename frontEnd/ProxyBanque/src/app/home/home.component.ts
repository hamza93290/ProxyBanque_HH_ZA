import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  template: `
    <p>
      home works!
    </p>
    <button routerLink="/conseillierLogin">Espace conseillier</button>
  `,
  styles: [
  ]
})
export class HomeComponent {

}
