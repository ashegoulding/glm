/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2.b;

/**
 *
 * @author elect
 */
public class Vec2b {

    public static final int SIZE = 2 * Byte.BYTES;

    public byte x, y;

    public Vec2b set(int x, int y) {
        return set((byte) x, (byte) y);
    }

    public Vec2b set(byte x, byte y) {
        this.x = x;
        this.y = y;
        return this;
    }
}