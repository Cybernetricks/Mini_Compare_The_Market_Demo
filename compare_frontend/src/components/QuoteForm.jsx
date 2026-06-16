import { useState } from "react";
import { getQuotes } from "../services/api";

export default function QuoteForm({ setQuotes }) {
  const [form, setForm] = useState({
    age: "",
    vehicleValue: "",
    yearsDriving: "",
    claims: ""
  });

  function handleChange(e) {
    setForm({
      ...form,
      [e.target.name]: e.target.value
    });
  }

  async function handleSubmit(e) {
    e.preventDefault();

    const data = {
      age: Number(form.age),
      vehicleValue: Number(form.vehicleValue),
      yearsDriving: Number(form.yearsDriving),
      claims: Number(form.claims)
    };

    const result = await getQuotes(data);
    setQuotes(result);
  }

  return (
    <form onSubmit={handleSubmit}>
      <h2>Get Insurance Quotes</h2>

      <input name="age" placeholder="Age" onChange={handleChange} />
      <input name="vehicleValue" placeholder="Vehicle Value" onChange={handleChange} />
      <input name="yearsDriving" placeholder="Years Driving" onChange={handleChange} />
      <input name="claims" placeholder="Claims" onChange={handleChange} />

      <button type="submit">Get Quotes</button>
    </form>
  );
}