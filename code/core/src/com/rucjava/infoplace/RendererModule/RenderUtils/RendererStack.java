package com.rucjava.infoplace.RendererModule.RenderUtils;

import com.badlogic.gdx.utils.Disposable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
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
