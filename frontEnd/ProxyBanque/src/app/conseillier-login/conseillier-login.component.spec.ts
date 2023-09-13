import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConseillierLoginComponent } from './conseillier-login.component';

describe('ConseillierLoginComponent', () => {
  let component: ConseillierLoginComponent;
  let fixture: ComponentFixture<ConseillierLoginComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ConseillierLoginComponent]
    });
    fixture = TestBed.createComponent(ConseillierLoginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
