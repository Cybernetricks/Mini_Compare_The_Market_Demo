import { useState } from "react";
import { getQuotes } from "../services/api";

export default function QuoteForm({ setQuotes }) {
  const [form, setForm] = useState({
    age: "",
    vehicleValue: "",
    yearsDriving: "",
    claims: ""
  });

  const [errors, setErrors] = useState({});

  function handleChange(e) {
    setForm({
      ...form,
      [e.target.name]: e.target.value
    });
  }

  async function handleSubmit(e) {
    e.preventDefault();

    if(!validate()) return;

    const data = {
      age: Number(form.age),
      vehicleValue: Number(form.vehicleValue),
      yearsDriving: Number(form.yearsDriving),
      claims: Number(form.claims)
    };

    const result = await getQuotes(data);
    setQuotes(result);
  }

  function validate() {
  const newErrors = {};

  if (!form.age) {
    newErrors.age = "Age is required";
  } else if (form.age < 17) {
    newErrors.age = "Must be at least 17";
  }

  if (!form.vehicleValue) {
    newErrors.vehicleValue = "Vehicle value is required";
  } else if (form.vehicleValue <= 0) {
    newErrors.vehicleValue = "Must be greater than 0";
  }

  if (!form.yearsDriving) {
    newErrors.yearsDriving = "Years driving is required";
  } else if (form.yearsDriving < 0) {
    newErrors.yearsDriving = "Cannot be negative";
  }

  if (form.claims === "") {
    newErrors.claims = "Claims is required";
  } else if (form.claims < 0) {
    newErrors.claims = "Cannot be negative";
  }

  setErrors(newErrors);

  return Object.keys(newErrors).length === 0;
}

  return (
    <form onSubmit={handleSubmit}>
      <h2>Get Insurance Quotes</h2>

      <input name="age" placeholder="Age" onChange={handleChange} />

      <input name="vehicleValue" placeholder="Vehicle Value" onChange={handleChange} />

      <input name="yearsDriving" placeholder="Years Driving" onChange={handleChange} />

      <input name="claims" placeholder="Claims" onChange={handleChange} />
      
      {errors.age && <p style={{ color: "red" }}>{errors.age}</p>}
      {errors.vehicleValue && <p style={{ color: "red" }}>{errors.vehicleValue}</p>}
      {errors.yearsDriving && <p style={{ color: "red" }}>{errors.yearsDriving}</p>}
      {errors.claims && <p style={{ color: "red" }}>{errors.claims}</p>}

      <button type="submit">Get Quotes</button>
    </form>
  );
}