/*
 * Copyright (C) 2020 projectName:bot-gamecenter,author:yuxuan
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.yuxuan66.botgamecenter.draw;

import lombok.Data;

import java.awt.*;

@Data
public class ImgCell implements IMergeCell {

    private Image img;

    private Integer x, y, w, h;

    @Override
    public void draw(Graphics2D g2d) {
        g2d.drawImage(img, x, y, w, h, null);
    }
}
