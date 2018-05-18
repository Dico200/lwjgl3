/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Provides boundary test information.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code IsTriggering} &ndash; True if the boundary system is being triggered. Note that due to fade in/out effects this may not exactly match visibility.</li>
 * <li>{@code ClosestDistance} &ndash; Distance to the closest play area or outer boundary surface</li>
 * <li>{@code ClosestPoint} &ndash; Closest point on the boundary surface</li>
 * <li>{@code ClosestPointNormal} &ndash; Unit surface normal of the closest boundary surface</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct ovrBoundaryTestResult {
 *     ovrBool IsTriggering;
 *     float ClosestDistance;
 *     {@link OVRVector3f ovrVector3f} ClosestPoint;
 *     {@link OVRVector3f ovrVector3f} ClosestPointNormal;
 * }</pre></code>
 */
@NativeType("struct ovrBoundaryTestResult")
public class OVRBoundaryTestResult extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ISTRIGGERING,
        CLOSESTDISTANCE,
        CLOSESTPOINT,
        CLOSESTPOINTNORMAL;

    static {
        Layout layout = __struct(
            __member(1),
            __member(4),
            __member(OVRVector3f.SIZEOF, OVRVector3f.ALIGNOF),
            __member(OVRVector3f.SIZEOF, OVRVector3f.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ISTRIGGERING = layout.offsetof(0);
        CLOSESTDISTANCE = layout.offsetof(1);
        CLOSESTPOINT = layout.offsetof(2);
        CLOSESTPOINTNORMAL = layout.offsetof(3);
    }

    OVRBoundaryTestResult(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link OVRBoundaryTestResult} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRBoundaryTestResult(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code IsTriggering} field. */
    @NativeType("ovrBool")
    public boolean IsTriggering() { return nIsTriggering(address()); }
    /** Returns the value of the {@code ClosestDistance} field. */
    public float ClosestDistance() { return nClosestDistance(address()); }
    /** Returns a {@link OVRVector3f} view of the {@code ClosestPoint} field. */
    @NativeType("ovrVector3f")
    public OVRVector3f ClosestPoint() { return nClosestPoint(address()); }
    /** Passes the {@code ClosestPoint} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRBoundaryTestResult ClosestPoint(java.util.function.Consumer<OVRVector3f> consumer) { consumer.accept(ClosestPoint()); return this; }
    /** Returns a {@link OVRVector3f} view of the {@code ClosestPointNormal} field. */
    @NativeType("ovrVector3f")
    public OVRVector3f ClosestPointNormal() { return nClosestPointNormal(address()); }
    /** Passes the {@code ClosestPointNormal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRBoundaryTestResult ClosestPointNormal(java.util.function.Consumer<OVRVector3f> consumer) { consumer.accept(ClosestPointNormal()); return this; }

    // -----------------------------------

    /** Returns a new {@link OVRBoundaryTestResult} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRBoundaryTestResult malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link OVRBoundaryTestResult} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRBoundaryTestResult calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link OVRBoundaryTestResult} instance allocated with {@link BufferUtils}. */
    public static OVRBoundaryTestResult create() {
        return new OVRBoundaryTestResult(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link OVRBoundaryTestResult} instance for the specified memory address. */
    public static OVRBoundaryTestResult create(long address) {
        return new OVRBoundaryTestResult(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRBoundaryTestResult createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link OVRBoundaryTestResult.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRBoundaryTestResult.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRBoundaryTestResult.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRBoundaryTestResult.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRBoundaryTestResult.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRBoundaryTestResult.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link OVRBoundaryTestResult.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRBoundaryTestResult.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRBoundaryTestResult.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link OVRBoundaryTestResult} instance allocated on the thread-local {@link MemoryStack}. */
    public static OVRBoundaryTestResult mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link OVRBoundaryTestResult} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static OVRBoundaryTestResult callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link OVRBoundaryTestResult} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRBoundaryTestResult mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link OVRBoundaryTestResult} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRBoundaryTestResult callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRBoundaryTestResult.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRBoundaryTestResult.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRBoundaryTestResult.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static OVRBoundaryTestResult.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRBoundaryTestResult.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRBoundaryTestResult.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRBoundaryTestResult.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRBoundaryTestResult.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #IsTriggering}. */
    public static boolean nIsTriggering(long struct) { return memGetByte(struct + OVRBoundaryTestResult.ISTRIGGERING) != 0; }
    /** Unsafe version of {@link #ClosestDistance}. */
    public static float nClosestDistance(long struct) { return memGetFloat(struct + OVRBoundaryTestResult.CLOSESTDISTANCE); }
    /** Unsafe version of {@link #ClosestPoint}. */
    public static OVRVector3f nClosestPoint(long struct) { return OVRVector3f.create(struct + OVRBoundaryTestResult.CLOSESTPOINT); }
    /** Unsafe version of {@link #ClosestPointNormal}. */
    public static OVRVector3f nClosestPointNormal(long struct) { return OVRVector3f.create(struct + OVRBoundaryTestResult.CLOSESTPOINTNORMAL); }

    // -----------------------------------

    /** An array of {@link OVRBoundaryTestResult} structs. */
    public static class Buffer extends StructBuffer<OVRBoundaryTestResult, Buffer> implements NativeResource {

        /**
         * Creates a new {@link OVRBoundaryTestResult.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRBoundaryTestResult#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected OVRBoundaryTestResult newInstance(long address) {
            return new OVRBoundaryTestResult(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code IsTriggering} field. */
        @NativeType("ovrBool")
        public boolean IsTriggering() { return OVRBoundaryTestResult.nIsTriggering(address()); }
        /** Returns the value of the {@code ClosestDistance} field. */
        public float ClosestDistance() { return OVRBoundaryTestResult.nClosestDistance(address()); }
        /** Returns a {@link OVRVector3f} view of the {@code ClosestPoint} field. */
        @NativeType("ovrVector3f")
        public OVRVector3f ClosestPoint() { return OVRBoundaryTestResult.nClosestPoint(address()); }
        /** Passes the {@code ClosestPoint} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRBoundaryTestResult.Buffer ClosestPoint(java.util.function.Consumer<OVRVector3f> consumer) { consumer.accept(ClosestPoint()); return this; }
        /** Returns a {@link OVRVector3f} view of the {@code ClosestPointNormal} field. */
        @NativeType("ovrVector3f")
        public OVRVector3f ClosestPointNormal() { return OVRBoundaryTestResult.nClosestPointNormal(address()); }
        /** Passes the {@code ClosestPointNormal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRBoundaryTestResult.Buffer ClosestPointNormal(java.util.function.Consumer<OVRVector3f> consumer) { consumer.accept(ClosestPointNormal()); return this; }

    }

}