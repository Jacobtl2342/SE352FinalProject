import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { RestaurantListComponent } from './restaurant-list/restaurant-list.component';

//Material Design Module
import { MaterialModule} from './material.module';
import { NavComponent } from './nav/nav.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { CustomerLandingComponent } from './customer-landing/customer-landing.component';
import { DriverLandingComponent } from './driver-landing/driver-landing.component';
import { RestAdminLandingComponent } from './rest-admin-landing/rest-admin-landing.component';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    AppComponent,
    RestaurantListComponent,
    NavComponent,
    RegisterComponent,
    LoginComponent,
    CustomerLandingComponent,
    DriverLandingComponent,
    RestAdminLandingComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    MaterialModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
