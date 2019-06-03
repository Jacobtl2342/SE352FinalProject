import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DriverLandingComponent } from './driver-landing.component';

describe('DriverLandingComponent', () => {
  let component: DriverLandingComponent;
  let fixture: ComponentFixture<DriverLandingComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DriverLandingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DriverLandingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
