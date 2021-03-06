/*
 * Activatable.java
 *
 * Copyright (C) 2013 Andreas de Vries
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see http://www.gnu.org/licenses
 * or write to the Free Software Foundation,Inc., 51 Franklin Street,
 * Fifth Floor, Boston, MA 02110-1301  USA
 * 
 * As a special exception, the copyright holders of this program give you permission 
 * to link this program with independent modules to produce an executable, 
 * regardless of the license terms of these independent modules, and to copy and 
 * distribute the resulting executable under terms of your choice, provided that 
 * you also meet, for each linked independent module, the terms and conditions of 
 * the license of that module. An independent module is a module which is not derived 
 * from or based on this program. If you modify this program, you may extend 
 * this exception to your version of the program, but you are not obligated to do so. 
 * If you do not wish to do so, delete this exception statement from your version.
 */
package org.mathIT.graphs;

/**
 * This interface guarantees activatable vertices of a graph, for instance
 * activatable {@link Actor actors} of a {@link SocialNetwork social network}.
 * @author Andreas de Vries
 */
public interface Activatable {
   /** Returns whether this vertex is active.
    *  @return whether this vertex is active
    */
   public boolean isActive();

   /** Sets the flag whether this vertex is active.
    *  @param active flag whether this vertex is active
    */
   public void setActive(boolean active);

   /** Returns the threshold of this vertex.
    *  In the linear threshold model the sum of incident neighbors' weights
    *  have to outvalue this threshold so that this actor becomes active.
    *  @return the threshold of this actor
    */
   public double getThreshold();

   /** Sets the threshold of this vertex.
    *  In the linear threshold model the sum of incident neighbors' weights
    *  have to outvalue this threshold so that this actor becomes active.
    *  @param threshold the threshold of this actor
    */
   public void setThreshold(double threshold);
}
