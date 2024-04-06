import { ApplicationConfig } from '@angular/core';
import {provideRouter, TitleStrategy} from '@angular/router';

import { routes } from './app.routes';
import { provideClientHydration } from '@angular/platform-browser';
import { provideAnimationsAsync } from '@angular/platform-browser/animations/async';
import {TemplatePageTitleStrategy} from "./shared/ui/page-title-strategray/TemplatePageTitleStrategy";
import {provideHttpClient} from "@angular/common/http";

export const appConfig: ApplicationConfig = {
  providers: [provideRouter(routes), provideClientHydration(), provideAnimationsAsync(),{provide: TitleStrategy, useClass: TemplatePageTitleStrategy},provideHttpClient() ]
};
