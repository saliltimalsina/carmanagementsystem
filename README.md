**2. Network Design**

**2.1. Assumptions and Requirements**

Before embarking on a detailed design of the network for the manufacturing company, it's imperative to lay down certain foundational assumptions, which will further help in addressing specific requirements.

**Assumptions:**

1. **Operational Hours:** The manufacturing company operates six days a week, with peak usage during daytime hours. However, certain processes, especially network backups and system updates, might run during off-peak hours or nights.
1. **Data Traffic:** A significant amount of data traffic is anticipated between the office building and the factory, particularly given the network-controlled machinery. Therefore, high-speed connectivity with minimal latency is crucial.
1. **Growth Perspective:** Over the next 5 years, the company may experience growth. This could involve an addition of machinery, employees, or even the extension of the physical premises. The network should be scalable to accommodate such expansions.
1. **Redundancy Needs:** Given the critical nature of the manufacturing processes, the network should have built-in redundancies to ensure zero downtime.
1. **External Access:** Engineers and administrators may require remote access to the company's network for troubleshooting, monitoring, or administrative tasks.
1. **Integration with Third-party Vendors:** The company might rely on third-party vendors for specific machinery components, software, or services. This implies potential network access points or integrations that need to be securely managed.

**Requirements:**

1. **Segmentation:** Based on the brief, the company requires at least three different IP subnets, but more might be needed considering potential growth and the need for further segmentation for security purposes.
1. **High-speed Connectivity:** To ensure seamless operations, especially given the real-time monitoring and control of machinery, the network should support high-speed data transfer, preferably Gigabit connectivity or higher.
1. **Security Infrastructure:** With intellectual property such as engineering designs and financial data housed locally, a robust security infrastructure, including firewalls, intrusion detection systems, and secure access controls, is paramount.
1. **Wireless Support:** A mix of wired and wireless devices will be used. The network should offer a strong and secure wireless connection, especially in areas where running physical cables might be challenging.
1. **Cloud Integration:** Even though core data will be stored locally, the company has shown interest in cloud services. The network should seamlessly integrate with selected cloud providers without compromising security.
1. **Backup and Recovery:** Considering potential data losses or network failures, there should be mechanisms in place for quick data recovery and network restoration.

**2.2. Network Design Details**

**Network Diagrams**

Understanding the intricate operations and data flows of the manufacturing company necessitates a comprehensive network diagram. Such a diagram aids in visualizing the interconnections, identifying potential vulnerabilities, and making informed decisions regarding security, redundancy, and scalability.

![network Diagram](network_diagram_Image.jpg)

In the diagram:

- **Internet**: This represents the public internet. Our connection to the outside world.
- **Gateway Router**: The primary entry and exit point for our internal networks. It will be protected by a robust firewall to prevent malicious intrusions.
- **Office Building & Factory**: These segments represent the two primary buildings in our company. Each building has its switch, distributing network resources to various departments in the office or machinery in the factory.
- **Security Infrastructure**: Dedicated to our IP-based security cameras and storage server. This ensures that our security footage remains segregated and secure.
- **Local Servers**: Houses essential data like engineering designs and finances. Directly connected to the admin department for easy access and secured from external intrusions.
- **WAP (Wireless Access Points)**: Facilitate wireless connections for devices such as laptops, mobile phones, and other wireless monitoring equipment

**Design Decisions**

The network design for the manufacturing company isn't simply a byproduct of modern conventions; it's meticulously crafted to cater to the company's unique demands. Delving deeper into the rationale behind our design decisions provides clarity on how the network blueprint aligns with the company's operational goals and security priorities.

1. **Segmented Network Architecture**: The clear demarcation between the office building, the factory, and the security infrastructure is no accident. By employing a segmented network architecture, we isolate different parts of the network. This means that issues – whether they be technical malfunctions or security breaches – in one segment won't ripple into others, ensuring operational continuity.
1. **Centralized Gateway Router**: Having a singular gateway router simplifies network management. It acts as a unified point of entry and exit, making it easier to monitor traffic, manage bandwidth, and implement security measures. The attached firewall serves as the first line of defense against potential cyber threats.
1. **Dedicated Switches**: The use of dedicated switches for the office, factory, and security setups aims to optimize data traffic and reduce bottlenecks. With separate switches, each segment can operate at peak efficiency without straining the resources of the other segments.
1. **Wireless Access Points (WAPs)**: Recognizing the increasing trend towards wireless devices, we've incorporated WAPs in both the office and factory setups. This offers flexibility for employees and factory workers alike, ensuring seamless connectivity regardless of their location within the premises.
1. **Isolated Security Infrastructure**: The decision to isolate the security infrastructure stems from the paramount importance of security footage and data. By segregating this data, we reduce the risk of potential tampering or unauthorized access.
1. **Local Servers in Admin Department**: Given the sensitive nature of the data housed in local servers (like engineering designs and finances), their direct connection to the admin department ensures limited and secured access. This decision prioritizes both efficiency (by providing the admin department with direct access) and security (by limiting external access points).

**Address Allocations**

An efficient IP address scheme remains pivotal to ensure smooth communication within a network and to account for future growth. The decisions regarding our IP address planning have taken into account the unique identifiers derived from the group members' IDs: 83 and 80.

1. **Use of Private IP Ranges**: Given the internal operations of our network, we've opted for private IP ranges. This offers a buffer against potential external conflicts and provides a broad address reservoir for scalability.
1. **Subnetting for Segmentation**: Aligning with the company's stipulation of employing /16 or /24 network masks, the IP addresses for our subnets have been fashioned around the last two digits of the group members' IDs, 83 and 80.
- **Office Building**: 83.10.0.0/24 - This subnet caters to up to 254 devices, comfortably accommodating the office's personnel with allowances for growth.
- **Factory**: 80.20.0.0/24 - Given the interconnected nature of machinery and monitoring systems, this subnet ensures the factory operates seamlessly while preparing for potential equipment augmentations.
- **Security Infrastructure**: 83.30.0.0/24 - A dedicated subnet for security assures fluid streaming and archival of security footage.
3. **Future Expansion**: The strategic constraint of our initial allocations to these address ranges provides ample space for future expansion. The integration of additional subnets can be achieved effortlessly, ensuring the company’s network remains adaptive to its evolving demands.

**Hardware Recommendations**

The foundation of any robust network is the hardware it utilizes. Here's a concise list of recommended hardware components tailored for our manufacturing company:

1. **High-Capacity Router**: A commercial-grade router, preferably from brands like Cisco or Juniper. This would ensure reliability, support for higher bandwidths, and provision for advanced security features.
1. **Layer 3 Switches**: For the office, factory, and security segments, Layer 3 switches are recommended. These would facilitate inter-VLAN routing, allowing for efficient communication between different segments while providing the capability for advanced network configurations.
1. **Wireless Access Points (WAPs)**: Enterprise-level WAPs from brands like Aruba or Ubiquiti. Given the wide coverage area and the number of wireless devices, these WAPs would ensure stable connections with good range.
1. **Firewall**: A dedicated hardware firewall, such as those from Fortinet or Palo Alto, to provide an added layer of security against external threats and unauthorized access.
1. **NAS (Network Attached Storage)**: For the security infrastructure, a NAS device would store 
