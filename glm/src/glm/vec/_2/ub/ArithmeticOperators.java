/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.vec._2.ub;

import glm.Glm;
import joou.UByte;

/**
 *
 * @author GBarbieri
 */
abstract class ArithmeticOperators {

    public static final int SIZE = 2 * Byte.BYTES;

    public UByte x = new UByte(), y = new UByte();

    public Vec2ub add_(byte b) {
        return Glm.add_((Vec2ub) this, b);
    }

    public Vec2ub add_(Vec2ub b) {
        return Glm.add_((Vec2ub) this, b);
    }

    public Vec2ub add(byte b) {
        return Glm.add((Vec2ub) this, (Vec2ub) this, b);
    }

    public Vec2ub add(Vec2ub b) {
        return Glm.add((Vec2ub) this, (Vec2ub) this, b);
    }

    public Vec2ub add(byte b, Vec2ub res) {
        return Glm.add(res, (Vec2ub) this, b);
    }

    public Vec2ub add(Vec2ub b, Vec2ub res) {
        return Glm.add(res, (Vec2ub) this, b);
    }

    public Vec2ub sub_(byte b) {
        return Glm.sub_((Vec2ub) this, b);
    }

    public Vec2ub sub_(Vec2ub b) {
        return Glm.sub_((Vec2ub) this, b);
    }

    public Vec2ub sub(byte b) {
        return Glm.sub((Vec2ub) this, (Vec2ub) this, b);
    }

    public Vec2ub sub(Vec2ub b) {
        return Glm.sub((Vec2ub) this, (Vec2ub) this, b);
    }

    public Vec2ub sub(byte b, Vec2ub res) {
        return Glm.sub(res, (Vec2ub) this, b);
    }

    public Vec2ub sub(Vec2ub b, Vec2ub res) {
        return Glm.sub(res, (Vec2ub) this, b);
    }

    public Vec2ub mul_(byte b) {
        return Glm.mul_((Vec2ub) this, b);
    }

    public Vec2ub mul_(Vec2ub b) {
        return Glm.mul_((Vec2ub) this, b);
    }

    public Vec2ub mul(byte b) {
        return Glm.mul((Vec2ub) this, (Vec2ub) this, b);
    }

    public Vec2ub mul(Vec2ub b) {
        return Glm.mul((Vec2ub) this, (Vec2ub) this, b);
    }

    public Vec2ub mul(byte b, Vec2ub res) {
        return Glm.mul(res, (Vec2ub) this, b);
    }

    public Vec2ub mul(Vec2ub b, Vec2ub res) {
        return Glm.mul(res, (Vec2ub) this, b);
    }

    public Vec2ub div_(byte b) {
        return Glm.div_((Vec2ub) this, b);
    }

    public Vec2ub div_(Vec2ub b) {
        return Glm.div_((Vec2ub) this, b);
    }

    public Vec2ub div(byte b) {
        return Glm.div((Vec2ub) this, (Vec2ub) this, b);
    }

    public Vec2ub div(Vec2ub b) {
        return Glm.div((Vec2ub) this, (Vec2ub) this, b);
    }

    public Vec2ub div(byte b, Vec2ub res) {
        return Glm.div(res, (Vec2ub) this, b);
    }

    public Vec2ub div(Vec2ub b, Vec2ub res) {
        return Glm.div(res, (Vec2ub) this, b);
    }

    public Vec2ub incr_() {
        return Glm.incr_((Vec2ub) this);
    }

    public Vec2ub incr() {
        return Glm.incr((Vec2ub) this);
    }

    public Vec2ub incr(Vec2ub res) {
        return Glm.incr(res, (Vec2ub) this);
    }

    public Vec2ub decr_() {
        return Glm.decr_((Vec2ub) this);
    }

    public Vec2ub decr() {
        return Glm.decr((Vec2ub) this);
    }

    public Vec2ub decr(Vec2ub res) {
        return Glm.decr(res, (Vec2ub) this);
    }
}
