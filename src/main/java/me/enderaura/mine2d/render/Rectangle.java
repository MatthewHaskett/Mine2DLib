/*
MIT License

Copyright (c) 2018 Matthew Haskett

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package me.enderaura.mine2d.render;

import org.bukkit.map.MapCanvas;

/**
 * @author Enderaura
 * @since 19/08/2018 18:06
 */
public class Rectangle implements Renderable {

    private final int x, y, height, length;
    private final byte colour;

    public Rectangle(int x, int y, int height, int length, byte colour){
        this.x = x;
        this.y = y;
        this.height = height;
        this.length = length;
        this.colour = colour;
    }

    @Override
    public void render(MapCanvas canvas) {
        for (int x = this.x; x < this.x + length; x++)
            for(int y = this.y; y < this.y + height; y++)
                canvas.setPixel(x, y, colour);
    }
}
