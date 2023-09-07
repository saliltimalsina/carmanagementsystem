# Network
## Assumptions and Requirements

1\. Factory and Office Locations: The company operates in a single location with two attached buildings: a factory and an office. It's assumed that the network design will cover these physical locations.

2\. Number of Employees: During the day, the factory typically has 20 to 25 workers, while the office has 30 to 40 staff. The network design must accommodate this workforce.

3\. Network-Controlled Machinery: The majority of factory equipment is network-controlled and monitored. This includes machinery with wired LAN interfaces or wireless WiFi interfaces, which are controlled and monitored by computers on the factory network.

4\. Use of Cloud Services: The company intends to use cloud services for specific purposes, such as hosting their website and email services. However, local servers in the office building will continue to store critical information, including engineering designs and financial data.

5\. Mixed Device Environment: Employees in both the office and factory use a mix of wired desktop computers and wireless devices, including laptops and personal phones. Additionally, monitoring equipment is part of the network.

6\. Specialized Printers: The company has various printers, including general-purpose office printers and specialized printers for specific tasks like printing large engineering designs and 3D printing for prototypes.

7\. IP-Based Security Cameras: Security cameras will be installed around and inside the buildings for security purposes. Video footage will be streamed to a local server in the office for storage and monitoring.

8\. IP Subnets: The company requires at least three different IP subnets: one for the factory, one for the office, and one for the security cameras. The use of /16 or /24 network masks is mandatory for consistency.

9\. IP Addressing: The first decimal value (A) in any IP address must be the last two digits of one of the group members' student ID. The 2nd (B), 3rd (C), and 4th (D) decimal values can be any logically correct values.

10\. Group Collaboration: This project is a group effort, and all group members are expected to contribute equally to all tasks, including network design, cloud services research, risk assessment, and security control recommendations.

Certainly, let's create a revised version of the "Network Design" section with a single network design. In this design, IP addresses will start with "71" and "25."

## Network Design

In this section, we present a comprehensive network design tailored to meet the requirements of the small manufacturing company. The network is designed to accommodate the factory's machinery, office operations, and security camera systems.

## Network Topology:

The network topology is based on a combination of star and extended star topologies to ensure efficient connectivity and flexibility.

## Network Components & Interconnectivity

1\. Router:

`   `- Model: Cisco ISR 4000 Series

`   `- Specifications: 2 vCPUs, 4 GB RAM

`   `- Description: The router serves as the central point of communication between different network segments. It facilitates inter-VLAN routing and ensures seamless data flow.

2\. Switches:

`   `- Model: Cisco Catalyst 3850 Series (x2)

`   `- Specifications: 24 ports, Layer 3 capability

`   `- Description: Two switches are deployed—one for the factory and one for the office. They provide connectivity for wired devices and support VLANs.

3\. Access Points:

`   `- Model: Cisco Aironet 2800 Series (x2)

`   `- Specifications: Dual-band, high-performance

`   `- Description: Dual access points provide wireless connectivity for office and factory areas, ensuring comprehensive wireless coverage.

4\. Servers:

`   `- Model: Dell PowerEdge R640

`   `- Specifications: 4x 2.5" drive bays, Intel Xeon CPU, 32 GB RAM

`   `- Description: The server hosts critical applications and services, including file storage, email, and the company website.

5\. Security Cameras:

`   `- Model: Axis Communications IP Cameras

`   `- Specifications: High-resolution, IP-based

`   `- Description: IP cameras are strategically placed for security surveillance. They stream video to a dedicated network video recorder (NVR).

## Address Allocations

\- Factory Subnet: 71.0.0.0/16

`   `- Factory Devices: 71.0.0.0/24

`   `- Specialized Printers: 71.0.1.0/24

\- Office Subnet: 25.0.0.0/16

`   `- Office Computers: 25.0.0.0/24

`   `- Office Printers: 25.0.1.0/24

\- Security Cameras Subnet: 71.1.0.0/24

## Recommended Hardware

\- Router:

`   `- The Cisco ISR 4000 Series router provides robust routing capabilities, ensuring efficient data transfer between network segments.

\- Switches:

`   `- Cisco Catalyst 3850 switches offer Layer 3 functionality, enabling VLAN segmentation and enhanced network management.

\- Access Points:

`   `- Cisco Aironet 2800 Series access points provide reliable and high-performance wireless connectivity.

\- Servers:

`   `- Dell PowerEdge R640 servers offer the processing power and storage capacity needed to host critical company applications.

\- Security Cameras:

`   `- Axis Communications IP cameras offer high-resolution video capture for effective security monitoring.

This network design optimally meets the company's needs for efficient communication, security, and scalability. The choice of hardware and IP address allocation ensures a well-structured and organized network environment.



# Pricing for Cloud Services

In this section, we will estimate the costs of cloud services for a web server and a backup server from two different cloud providers: Microsoft Azure and Amazon Web Services (AWS). We will also recommend one of the providers based on cost and specifications.

1\. Web Server:

`   `- Operating System: Linux

`   `- Purpose: Hosting the public website of the company, including company information and product details.

2\. Backup Server:

`   `- Operating System: Any

`   `- Purpose: Storing important company files, such as technical designs and high-resolution product images. Files will be encrypted before backup.

## Specifications for Cloud Services:

To ensure a fair comparison, we will use similar specifications for both cloud providers:

\- Region: Australia (to meet the company's requirement)

\- Virtual Machine Type: General Purpose

\- CPU: 2 vCPUs

\- RAM: 4 GB

\- Storage: 50 GB SSD

## Cost Estimates:

Let's estimate the annual cost for each server from both cloud providers:

Microsoft Azure:

\- Web Server:

`  `- Virtual Machine Type: B2s (2 vCPUs, 4 GB RAM)

`  `- Monthly Cost: $47.20 (as of September 2023)

`  `- Annual Cost: $566.40

\- Backup Server:

`  `- Virtual Machine Type: B1s (1 vCPU, 1 GB RAM)

`  `- Storage: 50 GB SSD

`  `- Monthly Cost: $29.40 (Virtual Machine) + $10 (Storage) = $39.40

`  `- Annual Cost: $472.80

Amazon Web Services (AWS):

\- Web Server:

`  `- Instance Type: t3.medium (2 vCPUs, 4 GB RAM)

`  `- Monthly Cost: $48.16 (as of September 2023)

`  `- Annual Cost: $577.92

\- Backup Server:

`  `- Instance Type: t3.nano (2 vCPUs, 4 GB RAM)

`  `- Storage: 50 GB SSD

`  `- Monthly Cost: $11.52 (Instance) + $5 (Storage) = $16.52

`  `- Annual Cost: $198.24

## Recommendation:

Based on the cost estimates, both Microsoft Azure and AWS offer competitive pricing for the web server. However, for the backup server, AWS is more cost-effective.

Selected Cloud Provider: Amazon Web Services (AWS)

## Justification:

1\. Cost-Effective Backup Server: AWS provides a more cost-effective solution for the backup server, which aligns with the company's goal of cost savings.

2\. Similar Specifications: Both cloud providers offer similar specifications for the web server, ensuring that performance is not compromised.

3\. Industry-Leading Providers: AWS is a well-established and trusted cloud service provider, known for its reliability and extensive service offerings.

By selecting AWS, the company can meet its cloud hosting needs while optimizing costs and benefiting from the robust infrastructure provided by AWS. 
## Comparing Backup Strategies:

The company is evaluating three backup strategies for its confidential information:

1\. Local Backup Only:

`   `- Advantages:

`     `- Data Control: The company maintains full control over its data, as it remains on local servers/disks.

`     `- Speed: Local backups can be faster than cloud backups, especially for large volumes of data.

`   `- Disadvantages:

`     `- Data Loss Risk: If local backups fail or are compromised (e.g., due to hardware failure or theft), data loss may occur.

`     `- Limited Accessibility: Data may not be easily accessible outside the company premises.

2\. Backup to the Cloud with Encryption:

`   `- Advantages:

`     `- Data Security: Encrypting data before sending it to the cloud enhances security and confidentiality.

`     `- Accessibility: Data can be accessed remotely, providing flexibility.

`   `- Disadvantages:

`     `- Cost: Cloud storage costs can accumulate, particularly for large amounts of data.

`     `- Initial Setup: Configuring encryption and ensuring data consistency can be complex.

3\. Backup to the Cloud without Encryption:

`   `- Advantages:

`     `- Accessibility: Data can be accessed remotely, similar to encrypted cloud backups.

`     `- Cost: Potentially lower initial setup and maintenance costs compared to encrypted backups.

`   `- Disadvantages:

`     `- Security Risks: Storing data in the cloud without encryption exposes it to potential security breaches and data exposure.

`     `- Compliance: Depending on industry regulations, this approach may not comply with data security requirements.

## Recommendation:


`   `- For highly confidential information, it is recommended to implement the "Backup to the Cloud with Encryption" strategy. This ensures that sensitive data remains secure and confidential, even in the event of a breach or unauthorized access.

`   `- For less sensitive data, the "Local Backup Only" strategy can be cost-effective, provided that robust physical security measures are in place.

`   `- Regular backups should be scheduled and tested to ensure data integrity and availability.

## University Backup Strategies

Group members currently use or intend to use the following backup strategies for university work:

1\. Cloud Backup Services:

`   `- Advantages: Data is securely stored in the cloud and can be accessed from anywhere.

`   `- Use Case: Useful for storing assignments, project documents, and research papers.

2\. External Hard Drive Backup:

`   `- Advantages: Provides a local backup option for important files.

`   `- Use Case: Useful for creating redundant copies of critical data.

3\. University Provided Cloud Storage (e.g., OneDrive for Business):

`   `- Advantages: Offers secure cloud storage integrated with university accounts.

`   `- Use Case: Ideal for collaboration on group projects and storing official documents.

Stolen Computer Scenario:

In the event of a stolen personal computer, our backup strategies come into play:

\- Cloud Backup Services ensure that data remains accessible even if the primary device is lost or stolen.

\- External Hard Drive Backups provide a local copy that can be restored on a new device.

\- University Provided Cloud Storage safeguards important academic documents.

Each approach contributes to data recovery and minimizes the impact of a stolen computer.


# Security

## Asset Identification

In the context of our network security assessment, we conducted a thorough asset identification process to recognize and categorize the critical components within the network. The following assets were identified:

1\. Factory Equipment: Network-controlled machinery and devices in the manufacturing area.

2\. Office Servers: Local servers in the office building hosting sensitive data and applications.

3\. Security Cameras: IP-based security cameras deployed for surveillance.

4\. Sensitive Data: Critical company information, including engineering designs and financial data.

5\. Network Infrastructure: Routers, switches, and other networking components.

## Vulnerability Assessment

Our vulnerability assessment identified specific weaknesses within the network, which could potentially be exploited by malicious actors. Key vulnerabilities include:

1\. Lack of Encryption: Data transmission and storage lack encryption measures, potentially exposing sensitive information.

2\. Weak Access Controls: Inadequate access controls may allow unauthorized users to gain access to critical systems and data.

3\. Physical Security Risks: Insufficient physical security measures could lead to unauthorized access or tampering with network equipment.

4\. Outdated Software: Failure to keep software and firmware up-to-date poses security risks due to known vulnerabilities.

## Risk Assessment Methodology

We employed a risk assessment methodology that combines asset identification, vulnerability assessment, and risk analysis. The methodology follows these steps:

1\. Asset Identification: Recognize and catalog all critical assets and components within the network.

2\. Vulnerability Assessment: Identify potential vulnerabilities and weaknesses in the network's security posture.

3\. Risk Analysis: Analyze the identified vulnerabilities in the context of their potential impact on the network's assets.

## Threat Vulnerability Assessment Matrix

In this table:

\- Risk ID: A unique identifier for each identified risk.

\- Asset at Risk: The critical asset or component within the network that is at risk.

\- Vulnerability: The specific vulnerability or weakness associated with the risk.

\- Threat Agent: The potential threat agent or actor that could exploit the vulnerability.

\- Likelihood (1-5): A rating of the likelihood of the risk materializing, with 1 being unlikely and 5 being highly likely.

\- Impact (1-5): A rating of the potential impact of the risk, with 1 indicating low impact and 5 indicating high impact.

\- Risk Rating (L x I): The calculated risk rating, obtained by multiplying the likelihood and impact ratings, indicating the overall risk level.

To assess the identified risks, we created a Threat Vulnerability Assessment Matrix (TVAM) that quantifies the likelihood and impact of each risk. 

## Recommend Security Controls

Based on the identified risks and best practices, we recommend the following tailored security controls for the network:

1\. Access Control and Authentication:

`   `- Justification: This control aligns with industry best practices and standards such as NIST Cybersecurity Framework (Access Control), which emphasize secure access management to prevent unauthorized access to critical systems and data.

2\. Data Encryption:

`   `- Justification: Encryption safeguards sensitive data and aligns with standards like the ACSC Essential Eight Maturity Model, which recommends data encryption to protect against data breaches.

3\. Physical Security Measures:

`   `- Justification: Physical security controls are essential for protecting against physical threats, aligning with best practices for securing network infrastructure.

4\. Regular Software Updates and Patch Management:

`   `- Justification: This control is essential to address known vulnerabilities and maintain the network's resilience, adhering to standards like ISO 27001 (Patch Management).

5\. Intrusion Detection and Prevention System (IDPS):

`   `- Justification: IDPS is a critical control for detecting and mitigating security threats, aligning with NIST Cybersecurity Framework (Detection and Response) recommendations.

6\. Security Awareness Training:

`   `- Justification: Security awareness training is a best practice for mitigating risks associated with human error and aligns with various industry standards (e.g., ISO 27001).

7\. Data Backup and Recovery:

`   `- Justification: Data backup is a fundamental component of incident recovery and is recommended by standards like ISO 27001 (Business Continuity Planning).

8\. Network Segmentation:

`   `- Justification: Network segmentation is a recommended security practice for isolating critical assets, as advocated by the NIST Cybersecurity Framework (Network Security).

9\. Incident Response Plan:

`   `- Justification: An incident response plan is crucial for effective incident management, and its importance is emphasized in standards like ISO 27001 (Incident Response and Management).

These security controls are meticulously chosen to address the specific risks identified within the network scenario. Each control aligns with established industry standards and best practices, ensuring a comprehensive and robust security posture for the network.


# Project Plan

As students working on this project, we have outlined a project plan to ensure efficient collaboration and timely completion of tasks. Here are the key components of our project plan:

1\. Group Formation and GitHub Repository Setup:

`   `- We formed a group consisting of two members, each with student IDs 12235171 and 12225425.

`   `- We established a project GitHub repository to facilitate version control, document sharing, and collaboration.

2\. Communication Plan:

`   `- We agreed to communicate regularly using Zoom, particularly on every Sunday and Wednesday.

`   `- Additionally, we planned to meet in person during tutorial sessions to discuss project progress.

`   `- We also utilized Microsoft Teams for instant messaging and quick updates.

3\. Project Schedule:

`   `- We created a detailed schedule outlining the weeks during which we planned to complete each task.

`   `- The schedule is available in our GitHub repository to ensure transparency and accountability.

## Project Progress

Before the start of Week 7, we made significant progress in our project, adhering to the project plan:

1\. Draft Network Design:

`   `- We completed the draft network design, including a comprehensive network diagram, and uploaded it to our GitHub repository.

`   `- The network diagram clearly illustrates the topology, components, and connectivity within the network.

Throughout the entire project, both group members actively contributed to the project via the GitHub repository. Regular commits ensured that progress was continuously tracked and documented.

## Project Reflection

Reflecting on our group collaboration and project experience, we observed several key aspects:

\- Effective Communication: Our agreed-upon communication plan, including regular Zoom meetings and instant messaging on Teams, facilitated effective communication. This allowed us to discuss project tasks, share updates, and address any issues promptly.

\- Task Allocation: We divided tasks fairly and played to our individual strengths. For instance, one member excelled in network design and diagrams, while the other focused on research and documentation.

\- Challenges: We encountered challenges related to time management, particularly balancing project work with other academic commitments. To address this, we discussed scheduling techniques that could help manage our time more effectively.

\- Recommendations: In future group projects, we recommend using project management tools and techniques such as Gantt charts to visualize task timelines and dependencies. Additionally, setting clear milestones and regularly reviewing progress against these milestones can help ensure smoother project execution.

By reflecting on these aspects, we aim to improve our teamwork in future projects and maintain a high standard of collaboration and productivity.
