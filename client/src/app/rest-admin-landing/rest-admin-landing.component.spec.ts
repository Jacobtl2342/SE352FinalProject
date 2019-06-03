import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RestAdminLandingComponent } from './rest-admin-landing.component';

describe('RestAdminLandingComponent', () => {
  let component: RestAdminLandingComponent;
  let fixture: ComponentFixture<RestAdminLandingComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RestAdminLandingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RestAdminLandingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
