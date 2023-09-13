import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsiillerHomeComponent } from './consiiller-home.component';

describe('ConsiillerHomeComponent', () => {
  let component: ConsiillerHomeComponent;
  let fixture: ComponentFixture<ConsiillerHomeComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ConsiillerHomeComponent]
    });
    fixture = TestBed.createComponent(ConsiillerHomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
