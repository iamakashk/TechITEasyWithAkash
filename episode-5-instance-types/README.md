# AWS EC2 Instance Types

Amazon EC2 (Elastic Compute Cloud) provides a wide selection of **instance types** designed to fit different use cases.  
Each instance type offers a unique combination of CPU, memory, storage, and networking capacity.

---

## 📌 What is an Instance Type?
An **Instance Type** defines the hardware configuration (like CPU, RAM, storage, and network) of your EC2 instance.  
Think of it as choosing the “size and power” of your virtual machine.

---

## 🏷️ Categories of Instance Types

### 1. General Purpose
- **Examples**: `t3.micro`, `t3a.small`, `m5.large`  
- **Use Case**: Balanced workloads (web servers, development environments, small databases).  
- **Key Feature**: Good balance of compute, memory, and networking.

---

### 2. Compute Optimized
- **Examples**: `c5.large`, `c6g.xlarge`  
- **Use Case**: High-performance processors needed (batch processing, game servers, scientific modeling).  
- **Key Feature**: High CPU-to-memory ratio.

---

### 3. Memory Optimized
- **Examples**: `r5.large`, `x1e.xlarge`  
- **Use Case**: In-memory databases, caching, real-time big data analytics.  
- **Key Feature**: High memory capacity relative to vCPU.

---

### 4. Storage Optimized
- **Examples**: `i3.large`, `d2.xlarge`  
- **Use Case**: Large datasets, data warehousing, high IOPS workloads.  
- **Key Feature**: High, fast local storage (SSD/HDD).

---

### 5. Accelerated Computing
- **Examples**: `p3.2xlarge`, `g4dn.xlarge`  
- **Use Case**: Machine learning, AI inference, GPU rendering, HPC.  
- **Key Feature**: GPU, FPGA, or custom accelerators for intensive computation.

---

## 📊 Instance Type Naming Convention
Example: **`t3.micro`**

- `t` → Instance family (General Purpose)  
- `3` → Generation (newer = better performance & features)  
- `micro` → Size (defines vCPUs and RAM)

---

## ✅ Best Practices
- Start with **General Purpose** (like `t2.micro` or `t3.micro`) in Free Tier.  
- Scale to **Compute/Memory Optimized** when workloads demand.  
- For cost savings:  
  - Use **Spot Instances** for non-critical workloads.  
  - Use **Savings Plans/Reserved Instances** for long-term workloads.  

---

## 🔗 Useful References
- [AWS EC2 Instance Types](https://aws.amazon.com/ec2/instance-types/)  
- [EC2 Pricing](https://aws.amazon.com/ec2/pricing/)  

---

## 📌 Author
**Tech IT Easy With Akash**  
Simplifying Cloud & Tech for Everyone 🚀
