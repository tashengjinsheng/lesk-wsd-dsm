/**
   Copyright (c) 2014, the LESK-WSD-DSM AUTHORS.

   All rights reserved.

   Redistribution and use in source and binary forms, with or without
   modification, are permitted provided that the following conditions are
   met:

 * Redistributions of source code must retain the above copyright
   notice, this list of conditions and the following disclaimer.

 * Redistributions in binary form must reproduce the above
   copyright notice, this list of conditions and the following
   disclaimer in the documentation and/or other materials provided
   with the distribution.

 * Neither the name of the University of Bari nor the names
   of its contributors may be used to endorse or promote products
   derived from this software without specific prior written
   permission.

   THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
   "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
   LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
   A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
   CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
   EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
   PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
   PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
   LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
   NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
   SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
    
   GNU GENERAL PUBLIC LICENSE - Version 3, 29 June 2007
 **/


package di.uniba.it.wsd.dsm;

/**
 * This class provides a basic object (e.g., term or document id) and
 * corresponding vector. <br>This is where the global variable vecLength
 * is configured. It represents the number of dimensions throughout
 * the whole package, and is used by many other classes.
 */
public class ObjectVector{
    /**
     * Number of dimensions used throughout the package.
     */
    public static int vecLength = 200;

    private final Object object;
    private float[] vector;

    /**
     *
     * @return
     */
    public Object getObject(){return object;};

    /**
     *
     * @return
     */
    public float[] getVector(){return vector;};

    /**
     *
     * @param newVector
     */
    public void setVector(float[] newVector){
	this.vector = newVector;
    }

    /**
     * @param object  The item (term, document, etc.) being assigned a vector.
     * @param vector  The corresponding vector.
     * @see VectorStore
     */
    public ObjectVector(Object object, float[] vector){
	this.object = object;
	this.vector = vector;
    }
}
