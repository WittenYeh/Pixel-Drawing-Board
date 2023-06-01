package com.rucjava.infoplace.RendererModule;

import com.rucjava.infoplace.RendererModule.Renderable;

import java.util.Stack;

public final class RendererStack implements Renderable {

    Stack<Renderable> stack;

    public RendererStack() {

    }
    private void initStack() {

    }
    public void render() {
        while (!this.stack.empty()) {
            Renderable renderer = stack.pop();
            renderer.render();
        }
        initStack();
    }
}
