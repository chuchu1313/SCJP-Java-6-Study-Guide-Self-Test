package CH10;

import static java.lang.System.*; // can use all static members in System

class _ {
    static public void main(String... __A_V_) { // arg[] = {"-", "A", "."}, variable use underline as the first char in identifier is ok
        String $ = ""; //dollar sign as the first char in identifier is ok
        for (int x = 0; ++x < __A_V_.length; ) // pre-increment ++x == 1 when do (++x < __A_V_.length)
            $ += __A_V_[x]; //only __A_V_[1] and __A_V_[2] will be appended to $
        out.println($);// $ == "A."
    }
}

