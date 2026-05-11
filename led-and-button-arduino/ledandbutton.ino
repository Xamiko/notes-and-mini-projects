const int buttonPin = 2;
const int ledPin = 6;
bool ledState = true;
bool lastButtonState = HIGH;

void setup() {
  pinMode(buttonPin, INPUT_PULLUP);
  pinMode(ledPin, OUTPUT);
  digitalWrite(ledPin, HIGH);
}

void loop() {
  bool buttonState = digitalRead(buttonPin);
  
  if (lastButtonState == HIGH && buttonState == LOW) {
    ledState = !ledState;
    digitalWrite(ledPin, ledState);
    delay(100);
  }
  
  lastButtonState = buttonState;
}