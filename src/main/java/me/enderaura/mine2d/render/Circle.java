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
 * @since 19/08/2018 18:07
 */
public class Circle implements Renderable {

    private final int xCenter, yCenter, radius;
    private final byte colour;

    public Circle(int x, int y, int radius, byte colour){
        this.xCenter = x;
        this.yCenter = y;
        this.radius = radius;
        this.colour = colour;
    }

    @Override
    public void render(MapCanvas canvas) {
         int r = radius * radius;

         int xCorner = xCenter-radius;
         int yCorner = yCenter-radius;

         for(int x = 0; x < radius*2; x++){
             for(int y = 0; y < radius*2; y++){
                 if((((x + radius) * (x+radius)) + ((y+radius)*(y+radius)) - r) <= 0){
                     canvas.setPixel(xCorner + x, yCorner + y, colour);
                 }
             }
         }

    }
}
