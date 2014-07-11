/**
 * Axelor Business Solutions
 *
 * Copyright (C) 2012-2014 Axelor (<http://axelor.com>).
 *
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.axelor.apps.message.db;
/**
 * Copyright (c) 2012-2013 Axelor. All Rights Reserved.
 *
 * The contents of this file are subject to the Common Public
 * Attribution License Version 1.0 (the “License”); you may not use
 * this file except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://license.axelor.com/.
 *
 * The License is based on the Mozilla Public License Version 1.1 but
 * Sections 14 and 15 have been added to cover use of software over a
 * computer network and provide for limited attribution for the
 * Original Developer. In addition, Exhibit A has been modified to be
 * consistent with Exhibit B.
 *
 * Software distributed under the License is distributed on an “AS IS”
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See
 * the License for the specific language governing rights and limitations
 * under the License.
 *
 * The Original Code is part of "Axelor Business Suite", developed by
 * Axelor exclusively.
 *
 * The Original Developer is the Initial Developer. The Initial Developer of
 * the Original Code is Axelor.
 *
 * All portions of the code written by Axelor are
 * Copyright (c) 2012-2013 Axelor. All Rights Reserved.
 */


/**
 * Interface of Event object. Enum all static variable of object.
 * 
 * @author dubaux
 * 
 */
public interface IMessage {


	/**
	 * Static status select
	 */
	static final int STATUS_DRAFT = 1;
	static final int STATUS_SENT = 2;
	static final int STATUS_DELETED = 3;
	
	
	/**
	 * Static status select
	 */
	static final int TYPE_RECEIVED = 1;
	static final int TYPE_SENT = 2;
	
	
	/**
	 * Static related to select
	 */
	static final String RELATED_TO_PARTNER = "com.axelor.apps.base.db.Partner";
	static final String RELATED_TO_LEAD = "com.axelor.apps.crm.db.Lead";
	static final String RELATED_TO_OPPORTUNITY = "com.axelor.apps.crm.db.Opportunity";
	static final String RELATED_TO_PRODUCT = "com.axelor.apps.base.db.Product";
	static final String RELATED_TO_EVENT = "com.axelor.apps.crm.db.Event";
	static final String RELATED_TO_SALESORDER = "com.axelor.apps.sale.db.SaleOrder";
	static final String RELATED_TO_PROJECT = "com.axelor.apps.organisation.db.Project";
	static final String RELATED_TO_TASK = "com.axelor.apps.organisation.db.Task";
	
	

}
