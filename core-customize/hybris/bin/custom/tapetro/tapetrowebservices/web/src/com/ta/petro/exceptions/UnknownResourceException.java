/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.ta.petro.exceptions;



public class UnknownResourceException extends RuntimeException
{
	public UnknownResourceException(final String msg)
	{
		super(msg);
	}
}