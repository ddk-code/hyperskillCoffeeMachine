class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        this.minutes = (this.minutes + 1) % 60;
        if (this.minutes == 0) {
            this.hours = (this.hours + 1) % 12;
        }
        if (this.hours == 0) {
            this.hours = 12;
        }
    }
}
