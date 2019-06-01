package com.hx.internal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author jxlgcmh
 * @create 2019-05-23 15:49
 */
public class UpperInputStream extends FilterInputStream {
	
	/**
	 * Creates a <code>FilterInputStream</code>
	 * by assigning the  argument <code>in</code>
	 * to the field <code>this.in</code> so as
	 * to remember it for later use.
	 *
	 * @param in the underlying input stream, or <code>null</code> if
	 *           this instance is to be created without an underlying stream.
	 */
	protected UpperInputStream(InputStream in) {
		super(in);
	}
	
	@Override
	public int read() throws IOException {
		
		int res = super.read();
		return res==-1?res:Character.toUpperCase((char)res);
		
	}
}
