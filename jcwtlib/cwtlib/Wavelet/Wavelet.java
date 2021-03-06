/*
 *   Continuous Wavelet Transform Library
 *   Copyright (C) 2004-2009 Stepan V. Karpenko <carp@mail.ru>
 *
 *   This library is free software; you can redistribute it and/or
 *   modify it under the terms of the GNU Lesser General Public
 *   License as published by the Free Software Foundation; either
 *   version 2.1 of the License, or (at your option) any later version.
 *
 *   This library is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *   Lesser General Public License for more details.
 *
 *   You should have received a copy of the GNU Lesser General Public
 *   License along with this library; if not, write to the
 *   Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 *   Boston, MA  02111-1307  USA
 */

package cwtlib.Wavelet;


/**
 * Abstract wavelet class
*/
public abstract class Wavelet implements Cloneable {
    private String _name;  // Wavelet name

    /**
     * Wavelet constructor
     *
     *  @param Name wavelet name.
    */
    protected Wavelet(String Name)
    {
        _name = Name;
    }

    /**
     * Real part of a wavelet in Time Domain
    */
    public abstract double reT(double t);
    /**
     * Imaginary part of a wavelet in Time Domain
    */
    public abstract double imT(double t);
    /**
     * Real part of a wavelet in Frequency Domain
    */
    public abstract double reF(double t);
    /**
     * Imaginary part of a wavelet in Frequency Domain
    */
    public abstract double imF(double t);
    /**
     * Central frequency
    */
    public abstract double cFreq();
    /**
     * Left boundary of effective support
    */
    public abstract double effL();
    /**
     * Right boundary of effective support
    */
    public abstract double effR();

    /**
     * Wavelet name
    */
    public String name()
    {
        return _name;
    }

    /**
     * Used to obtain object clone
    */
    public Wavelet clone()
    {
        try {
            return (Wavelet)super.clone();
        }
        catch (CloneNotSupportedException ex) {
            // Cloneable implemented. That is not possible!
            throw new Error("Unknown Error!");
        }
    }
}
