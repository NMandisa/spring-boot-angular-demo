import {Directive, ElementRef, Renderer2, HostListener,} from '@angular/core';

@Directive({
  selector: '[app-clear-div]',
  standalone: true
})
export class ClearDivDirective {
  // @Input() newContent: string;
  constructor(
    private elementRef: ElementRef,
    private renderer: Renderer2,
  ) {}

  ngOnInit(): void {
    // If you need to do anything on init
  }

  //Select your desired event.
  @HostListener('mouseenter')
  mouseEnter(eventData: Event) {
    this.renderer.setProperty(
      this.elementRef.nativeElement,
      'innerHTML',
      // this.newContent,
      'Hello from Clear div', // Put anything you like
    );
  }

}
