import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonopolyGameTest {
    class FakeDie extends Die {
        private int faceValue;

        public FakeDie() {
            faceValue=0;
        }

        @Override
        public void roll() {}

        public void setFaceValue(int value) {
            faceValue = value;
        }

        public int getFaceValue()
        {
            return faceValue;
        }
    }

}