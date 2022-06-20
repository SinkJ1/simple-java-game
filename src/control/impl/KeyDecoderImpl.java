package control.impl;

import configs.KeyButtons;
import control.KeyDecoder;

import java.util.Locale;

public class KeyDecoderImpl implements KeyDecoder {

    @Override
    public KeyButtons decode(String key) {
        return switch (key.toLowerCase(Locale.ROOT)) {
            case "a" -> KeyButtons.A;
            case "d" -> KeyButtons.D;
            case "w" -> KeyButtons.W;
            case "s" -> KeyButtons.S;
            default -> KeyButtons.NOT_IMPLEMENTED;
        };
    }
}
