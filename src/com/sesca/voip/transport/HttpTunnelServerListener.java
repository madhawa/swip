/* 
/  Copyright (C) 2009  Risto Känsäkoski - Sesca ISW Ltd
/  
/  This file is part of SIP-Applet (www.sesca.com, www.purplescout.com)
/  This file is modified from MjSip (http://www.mjsip.org)
/
/  This program is free software; you can redistribute it and/or
/  modify it under the terms of the GNU General Public License
/  as published by the Free Software Foundation; either version 2
/  of the License, or (at your option) any later version.
/
/  This program is distributed in the hope that it will be useful,
/  but WITHOUT ANY WARRANTY; without even the implied warranty of
/  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
/  GNU General Public License for more details.
/
/  You should have received a copy of the GNU General Public License
/  along with this program; if not, write to the Free Software
/  Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
*/

package com.sesca.voip.transport;



public interface HttpTunnelServerListener {
	  /** When a new incoming connection is established */ 
	   public void onIncomingConnection(HttpTunnelServer tcp_server, HttpTunnelSocket socket);
	   
	   /** When ConnectionServer terminates. */
	   public void onServerTerminated(HttpTunnelServer tcp_server, Exception error); 
}
