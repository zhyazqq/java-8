package main.java.com.demo;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class IPConnectionTest {
	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getByName("192.168.11.178");
			System.out.println(address);
			if (address instanceof java.net.Inet4Address) {
				System.out.println("��ַΪip4");
			} else if (address instanceof java.net.Inet6Address) {
				System.out.println("��ַΪip6");
			} else {
				System.out.println("δʶ���ַ");
			}
			
			
			if (address.isReachable(3000)) {
				System.out.println("success");
			} else {
				System.out.println("failure---δ��ͨ");
			}
//			Enumeration<NetworkInterface> netEnumeration = NetworkInterface.getNetworkInterfaces();
//			while (netEnumeration.hasMoreElements()) {
//				NetworkInterface networkInterface = netEnumeration.nextElement();
//
//				System.out.println("dispalyname=========:" + networkInterface.getDisplayName() + "==name==:"
//						+ networkInterface.getName());
//				if (address.isReachable(networkInterface, 0, 50000)) {
//					System.out.println("success");
//				} else {
//					System.out.println("failure---δ��ͨ--net");
//					System.out.println("failure");
//				}
//				Enumeration<InetAddress> ipsEnumeration = networkInterface.getInetAddresses();
//				while (ipsEnumeration.hasMoreElements()) {
//					System.out.println("failure---δ��ͨ--ipsnet");
//					System.out.println(ipsEnumeration.nextElement().getHostAddress());
//				}

//			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
