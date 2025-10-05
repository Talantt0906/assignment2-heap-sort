# 🧮 Shell Sort Empirical Analysis

This repository contains an implementation and performance analysis of **Shell Sort** and its comparison with **Heapsort**.  
The project explores theoretical and empirical aspects of sorting algorithms, including time and space complexity, performance visualization, and optimization discussion.

---

## 📘 Project Overview
This project was created as part of an academic assignment to analyze and compare sorting algorithms.  
The report focuses on **Shell Sort**, exploring its performance using different data distributions and input sizes, and validating theoretical predictions through experiments.

### Objectives
- Implement Shell Sort and Heapsort for comparison  
- Analyze **time and space complexity** using Big-O, Θ, and Ω notations  
- Measure and visualize **empirical performance** (time vs. input size)  
- Identify **constant factors** influencing practical runtime  
- Propose possible optimizations for better performance  

---

## ⚙️ Implementation Details
- **Language:** (e.g., Python / Java / C++)  
- **Algorithms Implemented:**  
  - Shell Sort (with multiple gap sequences)  
  - Heapsort (for baseline comparison)  
- **Input Types Tested:**  
  - Random  
  - Nearly-sorted  
  - Reverse-sorted  
  - Fully sorted  

---

## 📊 Empirical Results
Performance results were generated for both algorithms under different input sizes.  
Figures and detailed discussions can be found in the PDF report.

**Key Findings:**
- Heapsort maintains predictable \(O(n \log n)\) behavior.  
- Shell Sort performs faster on sorted and nearly-sorted data.  
- Constant factors (e.g., cache locality) significantly affect real-world performance.  
- Both algorithms align with their theoretical complexity bounds.  

📄 Full analysis is available in:
> **[`ShellSort_Report.pdf`](./ShellSort_Report.pdf)**

📷 Experimental result plots are located in the `/images/` folder.

---

## 🧠 Insights
| Algorithm | Average Complexity | Best Case | Worst Case | Stability | In-Place |
|------------|--------------------|------------|-------------|------------|-----------|
| **Shell Sort** | O(n<sup>1.3–1.5</sup>) | O(n log n) | O(n²) | ❌ | ✅ |
| **Heapsort** | O(n log n) | O(n log n) | O(n log n) | ❌ | ✅ |

---

## 🧩 File Structure
