import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import heroImg from './assets/hero.png'
import QuoteForm from "./components/QuoteForm";
import Results from "./components/Results";
import './App.css'

function App() {
  const [quotes, setQuotes] = useState([]);

  return (
    <div style={{ padding: "20px" }}>
      <h1>Compare Insurance Quotes</h1>

      <QuoteForm setQuotes={setQuotes} />

      <Results quotes={quotes} />
    </div>
  );
}

export default App
