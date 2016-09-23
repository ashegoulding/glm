/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm;

import glm.vec._2.Vec2;
import glm.vec._2.b.Vec2b;
import glm.vec._2.i.Vec2i;

/**
 *
 * @author GBarbieri
 */
public class BinaryOperators {

    public static Vec2 add_(Vec2 a, float b) {
        return add(new Vec2(), a.x, a.y, b, b);
    }

    public static Vec2 add_(Vec2 a, Vec2 b) {
        return add(new Vec2(), a.x, a.y, b.x, b.y);
    }

    public static Vec2 add(Vec2 a, float b) {
        return add(a, a.x, a.y, b, b);
    }

    public static Vec2 add(Vec2 a, Vec2 b) {
        return add(a, a.x, a.y, b.x, b.y);
    }

    public static Vec2 add(Vec2 res, Vec2 a, float b) {
        return add(res, a.x, a.y, b, b);
    }

    public static Vec2 add(Vec2 res, Vec2 a, Vec2 b) {
        return add(res, a.x, a.y, b.x, b.y);
    }

    public static Vec2 add(Vec2 res, float aX, float aY, float bX, float bY) {
        res.x = aX + bX;
        res.y = aY + bY;
        return res;
    }
    
    public static Vec2 mod(Vec2 res, Vec2 a, float bX, float bY) {
        res.x = a.x % bX;
        res.y = a.y % bY;
        return res;
    }

    public static Vec2 mod(Vec2 res, Vec2 a, float b) {
        res.x = a.x % b;
        res.y = a.y % b;
        return res;
    }
    
    public static Vec2b and_(Vec2b a, Vec2b b) {
        return and(new Vec2b(), a, b);
    }

    public static Vec2b and(Vec2b res, Vec2b a, Vec2b b) {
        res.x = (byte) (a.x & b.x);
        res.y = (byte) (a.y & b.y);
        return res;
    }

    public static Vec2i and_(Vec2i a, Vec2i b) {
        return and(new Vec2i(), a, b);
    }

    public static Vec2i and(Vec2i res, Vec2i a, Vec2i b) {
        res.x = (byte) (a.x & b.x);
        res.y = (byte) (a.y & b.y);
        return res;
    }
}
