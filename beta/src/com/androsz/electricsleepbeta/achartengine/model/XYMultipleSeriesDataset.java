/**
 * Copyright (C) 2009, 2010 SC 4ViewSoft SRL
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.androsz.electricsleepbeta.achartengine.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * A series that includes 0 to many XYSeries.
 */
public class XYMultipleSeriesDataset implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1766219700972279204L;
	/** The included series. */
	private final List<XYSeries> mSeries = new ArrayList<XYSeries>();

	/**
	 * Adds a new XY series to the list.
	 * 
	 * @param series
	 *            the XY series to ass
	 */
	public void addSeries(final XYSeries series) {
		mSeries.add(series);
	}

	/**
	 * Returns an array of the XY series.
	 * 
	 * @return the XY series array
	 */
	public XYSeries[] getSeries() {
		return mSeries.toArray(new XYSeries[0]);
	}

	/**
	 * Returns the XY series at the specified index.
	 * 
	 * @param index
	 *            the index
	 * @return the XY series at the index
	 */
	public XYSeries getSeriesAt(final int index) {
		return mSeries.get(index);
	}

	/**
	 * Returns the XY series count.
	 * 
	 * @return the XY series count
	 */
	public int getSeriesCount() {
		return mSeries.size();
	}

	/**
	 * Removes the XY series from the list.
	 * 
	 * @param index
	 *            the index in the series list of the series to remove
	 */
	public void removeSeries(final int index) {
		mSeries.remove(index);
	}

	/**
	 * Removes the XY series from the list.
	 * 
	 * @param series
	 *            the XY series to be removed
	 */
	public void removeSeries(final XYSeries series) {
		mSeries.remove(series);
	}

}